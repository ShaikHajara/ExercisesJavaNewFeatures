package com.typeinferic;

public class GenericClass<X> {

	//You can also create your own custom generic class and methods. In the following example, we are creating our own generic class and method.

	X name;
    public void setName(X name){
        this.name = name;
      }
    public X getName(){
        return name;
      }
    public String genericMethod(GenericClass<String> x){
        x.setName("John");
        return x.name;
      }

}
