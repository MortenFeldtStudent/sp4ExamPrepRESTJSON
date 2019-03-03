package generator;

import entity.Person;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Generator {

    private final Random random = new Random();
    private final String[] arrFirstName = {"Ib", "Mogens", "Lars", "Morten", "Kurt", "Hans", "Peter", "Jørgen", "Thomas", "Per"};
    private final String[] arrLastName = {"Hansen", "Jensen", "Nielsen", "Pertersen", "Pedersen", "Johansen", "Jørgensen"};
    
    private final List<Person> listPersons = new ArrayList();

    public List<Person> generate(int countSample, int firstIdSample) {
        
        int id = firstIdSample;
        
        for (int i = 1; i <= countSample; i++) {
            
            String fName = findRandomName(arrFirstName);
            String lName = findRandomName(arrLastName);
            int age = countAge(17, 70);
            listPersons.add(new Person(fName, lName, id, age));
            
            id += 1;
            
        }
        
        return listPersons;

//        StringBuilder finalSample = new StringBuilder();
//        int id = firstIdSample;
//
//        for (int i = 1; i <= countSample; i++) {
//
//            StringBuilder str = new StringBuilder();
//            str.append("{");
//
//            str.append("fname:");
//            str.append(" ");
//            str.append(findRandomName(arrFirstName));
//            str.append(",");
//            str.append(" ");
//
//            str.append("lname:");
//            str.append(" ");
//            str.append(findRandomName(arrLastName));
//            str.append(",");
//            str.append(" ");
//
//            str.append("id:");
//            str.append(" ");
//            str.append(String.valueOf(id));
//            str.append(",");
//            str.append(" ");
//
//            str.append("age:");
//            str.append(" ");
//            int age = countAge(17, 70);
//            str.append(String.valueOf(age));
//            str.append("}");
//
//            if (i != countSample) {
//                str.append(",");
//            }
//
//            finalSample.append(str.toString());
//
//            id += 1;
//
//        }
//
//        return finalSample.toString();

    }

    public int countAge(int firstAge, int lastAge) {
        return random.nextInt(lastAge - firstAge) + firstAge;
    }
    
    public String findRandomName(String[] arr){
        int count = random.nextInt(arr.length);
        return arr[count];
    }

}
