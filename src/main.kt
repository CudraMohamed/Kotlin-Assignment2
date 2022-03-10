fun main(){
    var p=students("codeHive")
    println(p)
    var n=num(7,2)
    println(n)
    var word=par("Cudra",20)
    println(word)
    ans()
}
fun students(name:String){
    var x1=name[4]
    var x2=name[5]
    var x3=name[6]
    var x4=name[7]
    println(x1.toString()+x2+x3+x4)

}
fun num(numb1:Int,numb2:Int):Int{
    var modulus=numb1%numb2
    return modulus
}
fun par(p:String,z:Int):String{
    var sentence="Hi,my name is $p and I am $z years old"
    return sentence
}
fun ans(){
    var s="Lilian"
    println(s.length)
}