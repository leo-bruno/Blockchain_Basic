
public class TestBlockChain {

	public static void main(String[] args) {
		Blockchain tcpCoin=new Blockchain();
		
		Block a=new Block("0x200",new java.util.Date(),"<transaccion>");
		Block b=new Block("0x200",new java.util.Date(),"<transaccionB>");
		Block c=new Block("0x200",new java.util.Date(),"<transaccionC>");
		
		tcpCoin.addBlock(a);
		tcpCoin.addBlock(b);
		tcpCoin.addBlock(c);
		
		//tcpCoin.getLatestBlock().setPreviousHash("sascfew");
		
		tcpCoin.displayChain();
		
		tcpCoin.isValid();
		

	}

}
