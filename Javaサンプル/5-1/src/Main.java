import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		{
//      問① 下記例の配列をString型しか格納できないように修正してください。
//		現状は全てのクラスの継承元であるObject型を指定しているので、Integerもintも格納可能になっています。
//	       例List<Object> array = new ArrayList<>();
//		また、arrayには[hoge, pos, foo]の文字列３要素を入れてください。
//	    <以下記述>
			List<String> array = new ArrayList<String>();
			array.add("hoge");
			array.add("pos");
			array.add("foo");
			

//      問② arrayの二つ目の要素を"bar"にしましょう。
//	　<以下記述>
			array.set(1,"bar");
			
//      問③ fooが格納されているインデックスを出力してください。
			System.out.println(array.get(2));
//	　<以下記述>
		}

		{
//      問④ キーがString型、バリューがObject型の要素を三つ格納しましょう。
		Map<String, Object> map = new HashMap<>();
//	　<以下記述>
		map.put("address", ("123"));
        map.put("name", ("Ryo"));
        map.put("age", ("23"));
        
        Object value1 = map.get("key1");
        Object value2 = map.get("key2");
        Object value3 = map.get("key3");

//      問⑤上記で格納したキーを繰り返し文で出力しましょう。
//	    <以下記述>
        System.out.println("\n----- keySet() -----");

        for (String key : map.keySet()) {
            System.out.println("key: " + key);
        }

//      問⑥上記で格納したバリューを繰り返し文で出力しましょう。
//	    <以下記述>
        System.out.println("\n----- valueSet() -----");

        for (Object val : map.values()) {
            System.out.println(val);
        }

		}
		{
//      問⑦ Calender型calを使い、int型配列arrayDateに今の年・月・日を入れてください。
			Calendar cal = Calendar.getInstance();
			int year = cal.get(Calendar.YEAR);
			int month = cal.get(Calendar.MONTH) + 1; 
			int day = cal.get(Calendar.DAY_OF_MONTH);
			
			
			
	

       
           
//	    <以下記述>
//      問⑧ 配列arrayDateをList型に置換しましょう。
//      ヒント：asListメソッドはプリミティブ型のデータ型のみ扱えます。
		List<Integer> arrayDate = new ArrayList<>(Arrays.asList(year, month, day));
        
           
//	    <以下記述>
//      問⑨ 上記で格納した要素を繰り返しで出力しましょう。
		for (int value : arrayDate) {
		    System.out.println(value);
		}
		

//	    <以下記述>


		 
	
		
	 }
       
        }
}

	


 


