fun main(){
    school()
    var y=sentence("Tessa",25)
    println(y)
    var jina="Angara"
    println("the length of my name is "+jina. length)
    var myName="TessaMarie"
    if( myName=="Phelisia"){
        println("Thats me")

    }else {
        println("i dont know who that is")
    }


    }





fun school(){
    var name = "Akirachix"
    var char1 =(name[0])
    var char2 =(name[2])
    var char3 =(name[3])
    var results="$char1$char2$char3"
    println(results)

}
fun sentence(name:String,age:Int):String{
    var greeting= "Hi, my name is $name, I am $age years old"
    return (greeting)

}

