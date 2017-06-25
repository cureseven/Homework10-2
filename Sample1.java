import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileWriter;

class Dengonban{
	static String filename = "dengonban.txt";
	void read(){
		try{
		    BufferedReader br = new BufferedReader(new FileReader(filename));
		    try {
		            String line = br.readLine();
		            System.out.println(line.toUpperCase());
		    } finally{
		        br.close();
		    }
		    }catch (IOException e) {
			System.out.println("メッセージはありません．");
		 }
	}
	void write() throws IOException{
			BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
			String str1 = br.readLine();
			try{
			      File file = new File(filename);

			        FileWriter filewriter = new FileWriter(file);

			        filewriter.write(str1+"\r\n");

			        filewriter.close();
			    }catch(IOException e){
			      System.out.println(e);
			    }
	}
}
public class Sample1 {
	public static void main(String[] args)throws IOException {
		Dengonban d = new Dengonban();
		System.out.println("メッセージを読む:1　書く:2");
		try{
			BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
				String str = br.readLine();
				int c = Integer.parseInt(str);//
				if(c==1){
					d.read();
				}else if(c==2){
					d.write();
				}else
				{
					System.out.println("入出力エラーです");
				}

		}catch(IOException e){
			System.out.println("入出力エラーです");
		}
	}
}
