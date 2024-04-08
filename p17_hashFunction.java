import java.util.*;

public class BasicHashTableDemo {
    public static void main(String[] args) {
        // Create a hash table with integer keys and string values
        Hashtable<Integer, String> hashTable = new Hashtable<>();

        // Insert key-value pairs
        hashTable.put(1, "Geeks");
        hashTable.put(12, "forGeeks");
        hashTable.put(15, "A computer");
        hashTable.put(3, "Portal");

        // Print the hash table
        System.out.println(hashTable);

        // Retrieve a value using a key
        int keyToRetrieve = 12;
        String value = hashTable.get(keyToRetrieve);
        System.out.println("Value for key " + keyToRetrieve + ": " + value);
    }
}
