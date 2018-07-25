package addCredits;
import java.util.*;

public class CreditClientInfo {
	
	private Map<String, Integer> clientToCredit = new HashMap<>();
	private NavigableMap<Integer, Set<String>> creditToClient= new TreeMap<>();
	private int offset = 0;
	public void insert(String clientID, int credit) {
		remove(clientID);
		credit -= offset;
		clientToCredit.put(clientID, credit);
		if(!creditToClient.containsKey(credit)) {
			creditToClient.put(credit, new HashSet<String>());
		}
		creditToClient.get(credit).add(clientID);
		//return false;
	}
	public boolean remove(String client) {
		if(!clientToCredit.containsKey(client)) {
			return false;
		} 
		int credit = clientToCredit.get(client);
		Set<String> allClients = creditToClient.get(credit);
		allClients.remove(client);
		if(allClients.size() == 0) {
			creditToClient.remove(credit);
		}
		clientToCredit.remove(client);
		return true;
	}
	public int lookUp(String client) {
		if(clientToCredit.containsKey(client)) {
			return clientToCredit.get(client) + offset;
		}
		return -1;
	}
	public void addCredit (int c ) {
		offset += c;
	}
	public String max() {
		if(creditToClient.size() > 0) {
			creditToClient.lastEntry().getValue().iterator().next() ;
		}
		return "";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
