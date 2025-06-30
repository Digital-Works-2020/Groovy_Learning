import groovy.io.FileType

class Main {
    static void main(String[] args) {
        // Read numbers from files and store them in List
        ArrayList numList = new ArrayList()
        File resources = new File("resources")
        resources.eachFileRecurse(FileType.FILES) {File fileObj ->
            fileObj.eachLine { String line, Integer no ->
                try {
                    numList.add(line.trim().toInteger())
                }
                catch(NumberFormatException e){
                    println "Unable to convert line to integer: ${line}"
                }
            
            }
        }
        println numList
        // Find the highest number
        println(numList.max())
        // Create the sum of all numbers
        println(numList.sum())
    }
}
