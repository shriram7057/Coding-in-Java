class String_Builder {  
    public static void main(String[] args) {  
        // Creating a StringBuilder  
        StringBuilder sb = new StringBuilder("Hello");  
        // Appending to the StringBuilder  
        sb.append(", World!");  
        // Inserting into the StringBuilder  
        sb.insert(5, " Java");  
        // Deleting from the StringBuilder  
        sb.delete(5, 10);  
        System.out.println(sb); // Output: Hello, World!  
    }  
}  