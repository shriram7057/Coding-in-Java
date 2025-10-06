class String_Buffer {  
    public static void main(String[] args) {  
        // Creating a StringBuffer  
        StringBuffer sb = new StringBuffer("Hello");  
        // Appending to the StringBuffer  
        sb.append(", World!");  
        // Inserting into the StringBuffer  
        sb.insert(5, " Java");  
        // Deleting from the StringBuffer  
        sb.delete(5, 10);  
        System.out.println(sb); // Output: Hello, World!  
    }  
}  