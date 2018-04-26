public class InstanceVarExample {
String myInstanceVar = "instance Variable";

public static void main (String args[]) {
InstanceVarExample obj = new InstanceVarExample();
InstanceVarExample obj2 = new InstanceVarExample();
InstanceVarExample obj3 = new InstanceVarExample();

System.out.println(obj.myInstanceVar);
System.out.println(obj2.myInstanceVar);
System.out.println(obj3.myInstanceVar);

obj.myInstanceVar = "OBJ Instance Variable";
obj2.myInstanceVar = "OBJ2 Instance Variable";
//obj3.myInstanceVar = "OBJ3 Instance Variable";

System.out.println(obj.myInstanceVar);
System.out.println(obj2.myInstanceVar);
System.out.println(obj3.myInstanceVar);


}
}
