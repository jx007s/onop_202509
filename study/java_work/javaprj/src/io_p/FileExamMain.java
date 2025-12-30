package io_p;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Comparator;
import java.util.TreeSet;



public class FileExamMain {
	
	static class FFStud{
		int avg, rank;
		private String ppp;
		
		FFStud(String str) {
			str = str.trim();
			String [] arr = str.substring(str.indexOf("_")+1).split(",");
			int tot = 0;
			for (String j : arr) {
				tot += Integer.parseInt(j);
			}
			avg = tot/arr.length;
			ppp = str+","+tot+","+avg+",";
		}
		
		void calcRank(TreeSet<FFStud> studs) {
			rank = 1;
			
			for (FFStud you : studs) {
				if(avg<you.avg) {
					rank++;
				}
			}
		}

		@Override
		public String toString() {
			return ppp+rank+"\n";
		}
	}


	public static void main(String[] args) {
		try {
			Reader rr = new FileReader("fff/exam.txt");
			
			
			//ArrayList<FFStud> studs = new ArrayList<FileExamMain.FFStud>();
			TreeSet<FFStud> studs = new TreeSet<FileExamMain.FFStud>(
					new Comparator<FFStud>() {

				@Override
				public int compare(FFStud o1, FFStud o2) {
					
					return o2.avg-o1.avg;
				}
			});
			
			String ttt = "";
			int data;
			while((data=rr.read())!=-1) {
				
				if((char)data=='\n') {
					//System.out.println(calc(ttt));
					//ww.write(calc(ttt));
					studs.add(new FFStud(ttt));
					ttt = "";
				}else {
					ttt += (char)data;
				}
			}
			
			rr.close();
			
			Writer ww = new FileWriter("ggg/examRes.txt");
			
			for (FFStud me : studs) {
				
				me.calcRank(studs);
				
				ww.write(me.toString());
			}
			
			ww.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
