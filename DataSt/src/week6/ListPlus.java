package week6;

public class ListPlus extends ListStack<String>{
	public String getPostEq(String s) {
		String str ="";
		for(int i = 0; i < s.length(); i++) {
			char sc = s.charAt(i);
			if(sc != '+' && sc != '-' && sc != '*' && sc != '/' && sc != ')' &&  sc != '(') { //�ǿ�����
				str += sc;
			}
			else if(sc == '(') {	// ���� ��ȣ
				push(sc+"");
			}
			else if(sc == ')') {	//�ݴ� ��ȣ
				while(true) {
					if(peek().equals("(")==false)
						str+=pop();
					else {
						pop();
						break;
					}
				}
			}
			else {	//������
				if(sc == '+' || sc == '-') {
					while(true) {
						if(getSize() == 0 || peek().equals("(")) {	//��ȣ�� �����ų� ������ ���ų�
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
						if(getSize() == 0 || peek().equals("(") || peek().equals("+") || peek().equals("-")) {	//��ȣ�� �����ų� ������ ���ų� +-
							push(sc+"");
							break;
						}
						else
							str+=pop();
					}
				}
			}
		}
		while(true) {	//���ڿ� ���� �� ��ó��
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
