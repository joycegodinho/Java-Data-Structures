package EstruturasDados;

public class ExemploArrays {

	public static void main(String[] args) {
		String[] alphabet = {"a", "b", "c", "d", "e", "f", "g"};
		
		System.out.println("For");
		System.out.println("Pelo indice");
		
		for(int i = 0; i < alphabet.length; i++) {
			System.out.print(alphabet[i] + " ");	
			//a b c d e f g
		}
		
		System.out.println();
		System.out.println("Pelo valor: for-each");
		
		for(String letter: alphabet) {
			System.out.print(letter + " ");
			//a b c d e f g
		}

		System.out.println();
		System.out.println("Arrays multidimencionais");
		
		String[][] users = {
				{"John", "Williams", "jw@testemail.com", "65398720"},
				{"Sarah", "Jackson", "sj@testemail.com", "27354690"},
				{"Rachel", "Wallace", "rw@testemail.com", "23566783"}		
		};
		
		int lines = users.length;
		int rows = users[0].length;
		
		System.out.println();
		System.out.println("Dimensoes da matriz");
		System.out.println("Numero de usuarios: " + lines); //3
		System.out.println("Numero de fields: " + rows); //4
		
		System.out.println();
		System.out.println("For");
		System.out.println("Pelo índice - matriz[linha][coluna]");
		
		for(int j = 0; j < lines; j++) {
			System.out.print("[ ");
			for (int k = 0; k < rows; k++) {
				String field = users[j][k];
				System.out.print(field + " ");			
			}
			System.out.println(" ]");			
		}
		//[ John Williams jw@testemail.com 65398720  ]
		//[ Sarah Jackson sj@testemail.com 27354690  ]
		//[ Rachel Wallace rw@testemail.com 23566783  ]
		
		System.out.println();
		System.out.println("Pelo valor - for-each");
		
		for(String[] line: users) {
			System.out.print("[ ");
			for (String row: line) {
				System.out.print(row + " ");
			}
			System.out.println(" ]");
		}
		//[ John Williams jw@testemail.com 65398720  ]
		//[ Sarah Jackson sj@testemail.com 27354690  ]
		//[ Rachel Wallace rw@testemail.com 23566783  ]
		

		

	}

}
