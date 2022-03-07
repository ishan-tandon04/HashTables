/**
 HashTable Lab
 The program creates a HashTable
 Author: Ishan Tandon
 Collaborator(s):n/A
 Collaboration:n/A
 Date: 3/7/22
 On My Honor, I confirm that I followed all collaboration policy guidelines,
 and that the work I am submitting is my own: IT
 **/

import java.lang.Math;

public class HashTable {
    private String[] hashTable; //instance data for hashTable and sectionsFilled
    int sectionsFilled;

    //default constructor
    public HashTable(int capacity){
        hashTable = new String[capacity];
        sectionsFilled = 0;
    }

    //put method
    public boolean put(String key, String value){
        boolean success = false; //value for boolean set to false default
        int hash = hashCode(key);
        if(sectionsFilled == hashTable.length){ //grow array if needed
            String[] newHashTable = new String[hashTable.length * 2];
            for(int i=0; i<hashTable.length; i++){
                newHashTable[i] = hashTable[i];
            }
            hashTable = newHashTable;
        }
        while(hash >= hashTable.length){ //making the array bigger
            String[] newHashTable = new String[hashTable.length * 2];
            for(int i=0; i<hashTable.length; i++){
                newHashTable[i] = hashTable[i];
            }
            hashTable = newHashTable;
        }
        if (hashTable[hash] == null) {
            success = true;
            hashTable[hash] = value;
            sectionsFilled ++;
        }
        return success;
    }

    //get method
    public String get(String key){
        int hash = hashCode(key);
        while(hash >= hashTable.length){
            String[] newHashTable = new String[hashTable.length * 2];
            for(int i=0; i<hashTable.length; i++){
                newHashTable[i] = hashTable[i];
            }
            hashTable = newHashTable;
        }
        return hashTable[hash];
    }


    private int hashCode(String key){ //returns int from a certain range
        String keyVal = "";
        for(int i = 0; i<key.length(); i++){
            keyVal += (int)key.charAt(i)-'a';
        }
        int indexValue = (int) Integer.parseInt(keyVal);
        return indexValue;
    }
}
