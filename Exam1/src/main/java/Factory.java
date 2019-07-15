public class Factory {
    public  static ListUtil getTradition (){
        return  new Tradition();
    }
    public  static ListUtil getJDK8 (){
        return  new JDK8();
    }
}
