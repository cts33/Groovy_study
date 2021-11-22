class Test1 {
    static void main(String[] args) {
        def closure = { str->
            println "hello $str"
        }
//        closure("world")
//        closure.call("33")

        Person p =new Person();
        p.name ="hh"

        println "p=${p.name}"


    }


}


