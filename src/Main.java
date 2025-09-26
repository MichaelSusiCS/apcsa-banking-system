import zoo.;
import java.util.;
public class Main {
public static void main(String[] args){
Zoo z = new Zoo(); Scanner sc = new Scanner(System.in);
System.out.println("Zoo CLI: a(add) l(list) f(feed all) s(search) q(quit)");
while(true){
System.out.print("> ");
String cmd = sc.next();
switch(cmd){
case "a" -> {
System.out.print("type (lion/eagle/snake) name age: ");
String t=sc.next(); String n=sc.next(); int age=sc.nextInt();
Animal a = switch(t){
case "lion" -> new Lion(n,age);
case "eagle"-> new Eagle(n,age);
default -> new Snake(n,age);
};
z.add(a); System.out.println("Added "+a);
}
case "l" -> z.list().forEach(System.out::println);
case "f" -> System.out.println("Total calories: "+z.feedAll());
case "s" -> { System.out.print("name: "); String n=sc.next();
System.out.println(z.findByName(n).orElse(null)); }
case "q" -> { System.out.println("Bye"); return; }
default -> System.out.println("Unknown");
}
}
}
}
