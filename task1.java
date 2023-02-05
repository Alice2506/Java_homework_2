import java.text.Format;

/*
Задание 1.
Дана строка sql-запроса "select * from students where ".
Сформируйте часть WHERE этого запроса, используя StringBuilder.
Данные приведены ниже в виде json строки.
Если значение null, то параметр не должен попадать в запрос.

Входная строка:
{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

Выходная строка:
select * from students where name = "Ivanov" and country = "Russia" and city = "Moscow"
*/

 public class task1 {
    
    public static String incomeStr = "select * from students where ";
    public static void main(String[] args) {
        String jsonStr = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        String firstVarStr = jsonStr.replace("{", "").replace("}", "").replace("\"", "");
        String [] secVarStr = firstVarStr.split(",");
        StringBuilder finalString = new StringBuilder(incomeStr);
        for (String string2 : secVarStr) {
            String [] thrdVarStr = string2.split(":");
            if (!"null".equals(thrdVarStr[1])) {
                finalString.append(thrdVarStr[0]).append(" = ").append(thrdVarStr[1]);
            }            
        }
        System.out.println(finalString);
    }
 }