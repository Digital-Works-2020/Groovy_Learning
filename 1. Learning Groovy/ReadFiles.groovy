class ReadFiles{
    static void main(String[] args){
        File file = new File("Collections.groovy")
        println file.getText('UTF-8')

        //Iterate over each line
        file.eachLine { String line, Integer no ->
            println no + "\t" + line
        }
    }
}
