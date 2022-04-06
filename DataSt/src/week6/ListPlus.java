package week6;

public class ListPlus extends ListStack<String>{
	public String getPostEq(String s) {
		String str ="";
		for(int i = 0; i < s.length(); i++) {
			char sc = s.charAt(i);
			if(sc != '+' && sc != '-' && sc != '*' && sc != '/' && sc != ')' &&  sc != '(') { //피연산자
				str += sc;
			}
			else if(sc == '(') {	// 여는 괄호
				push(sc+"");
			}
			else if(sc == ')') {	//닫는 괄호
				while(true) {
					if(peek().equals("(")==false)
						str+=pop();
					else {
						pop();
						break;
					}
				}
			}
			else {	//연산자
				if(sc == '+' || sc == '-') {
					while(true) {
						if(getSize() == 0 || peek().equals("(")) {	//괄호를 만나거나 스택이 없거나
							push(sc+"");
							break;
						}
						else {
							str+=pop();
						}
					}
				}
				else if(sc == '*' || sc == '/') {
					while(true) {
						if(getSize() == 0 || peek().equals("(") || peek().equals("+") || peek().equals("-")) {	//괄호를 만나거나 스택이 없거나 +-
							push(sc+"");
							break;
						}
						else
							str+=pop();
					}
				}
			}
		}
		while(true) {	//문자열 정렬 후 뒷처리
			if(getSize() == 0)
				break;
			else
				str+=pop();
		}
		return str;
	}
	public double calc (String[] s) {
		int result = 0;
		for(int i = 0; i < s.length; i++) {
			if(s[i].equals("+"))
				push((Integer.parseInt(pop()) + Integer.parseInt(pop()))+"");
			else if(s[i].equals("-"))
				push((-1*Integer.parseInt(pop())+Integer.parseInt(pop()))+"");
			else if(s[i].equals("/"))
				push((1/Integer.parseInt(pop())*Integer.parseInt(pop()))+"");
			else if(s[i].equals("*"))
				push((Integer.parseInt(pop())*Integer.parseInt(pop()))+"");
			else
				push(s[i]);
		}
		result = Integer.parseInt(pop());
		return result;
	}
}
