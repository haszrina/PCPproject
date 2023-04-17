import java.util.*;

public class rr {

ArrayList<Integer> pb =new ArrayList<>();   // process burst time value array
ArrayList<Integer> bt =new ArrayList<>();  //burst time initial value array
ArrayList<Integer> wt =new ArrayList<>();  // waiting time value array
ArrayList<Integer> tt =new ArrayList<>();  //turn around time value array

Scanner in = new Scanner(System.in);

int qt,totalProcess,t = 0; // quantum,total waiting time,total turnaround time, total for checking all process is done, end time
double avWT = 0; //average waiting time
double avTA = 0; //average turnaround time
double totalWT = 0;
double totalTA = 0;
boolean stopLoop = false; //process
int counter = 1; //counter

    public static void main(String[] args) {
      rr n = new rr();
    	n.userdata();
    	n.computedata();
	n.printdata();

    }

	public void computedata(){

    	System.out.println("calculation started");
        for(int var=0;var<pb.size();var++){  // loop nak letak siap2 nilai 0 dalam turnaround time array
                    tt.add(0);              //nilai array initial jadi 0 untuk diubah nanti
                }
    	while(true){
                totalProcess = 0;
    		for (int var=0;var<pb.size();var++){
    			if(pb.get(var) > qt){
    				t = t+qt;                    //time makin tambah
                                int a = pb.get(var) - qt;
                                pb.remove(var);           //ganti nilai array burst time and letak nilai baru yg ditolak
    				pb.add(var, a);
    			}
                        else if(pb.get(var) <= qt && pb.get(var) !=0){
    				t = t + pb.get(var);
                                pb.remove(var);
                                pb.add(var,0);                   //process done so nilai process = 0

    			}
                        if(pb.get(var) == 0){                    //kalau process = 0, ganti nilai array turn around time dgn current time pada index yg sama
                            if(tt.get(var)==0){
                                tt.remove(var);
                                tt.add(var,t);
                            }
                        }
                }

                for(int var=0;var<pb.size();var++){
                    totalProcess = totalProcess + pb.get(var);        // kira total all process punya baki
                }
                if(totalProcess == 0){
                    stopLoop = true;                     // kalau smua dah abis maka condition loop untuk berenti = true
                }
                else{
                    stopLoop = false;
                }
                if (stopLoop == true){                   // loop stop
                    break;
                }
                    }
        for(int var=0;var<pb.size();var++){              // kira nilai waiting time and letak dalam array value waiting time
              wt.add(var,tt.get(var) - bt.get(var));        // waiting time = turnaround time - burst time
              totalWT = totalWT + wt.get(var);              //untuk average waiting time
              totalTA = totalTA + tt.get(var);              //untuk average turnaround time
                }
        avWT = totalWT/pb.size();
        avTA = totalTA/pb.size();

    	}
        public void userdata(){
    	System.out.println("Enter the value of quantum");
    	qt = in.nextInt();
    	while (true){
    		System.out.println("Enter process "+counter+" burst time , press n to cancel");
    		try{
    			in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?"); //kalau ada remaining \n atau seangkatan denganya
	    		String word = in.nextLine();

	    			if(word.equals("n")){
	    			break;  //break loop input
	    				}
	    			int val = Integer.parseInt(word);  //tukar input string dalam int
	    			pb.add(val); //array burst time value
	    			bt.add(val);// array  burst time
    		}
    		catch (NumberFormatException e) {
           	System.out.println("error. not number"); //error kalau letak number dgn perkataan skali
    	}
                counter = counter + 1;
    	}
    }

        public void printdata(){
            System.out.println("Process\tBurst Time\tWaiting Time\tTurnaround Time");
            for(int var=0;var<pb.size();var++){
                    System.out.println((var+1)+"\t"+bt.get(var)+"\t\t"+wt.get(var)+"\t\t"+tt.get(var));
                }

            System.out.printf("average waiting time = %.2f\n",avWT);
            System.out.printf("average turnaround time = %.2f\n",avTA);

        }
}
