public class cod{
    public static void main(String[] args){
        int count = 10;

List<Character> chars = new ArrayList<>();

do {

	chars.add('a');

	for (Character x : chars) count -=1;

} while (count > 0);

System.out.println(chars.size());
    }
}

