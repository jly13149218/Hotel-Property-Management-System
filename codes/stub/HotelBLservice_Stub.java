
public class HotelBLservice_Stub {
	String hotelName;
	String hotelID;
	String hotelAddress;
	String inBusiness;
	String tel;
	String info;         //�Ƶ���
	String sort;
	ArrayList<HotelVO> hotelList;
	double poStrings;    //�ͻ���������
	double points;       //�Ƶ�����
	int readyRoom;       //���෿����
	
	public HotelBLservice_Stub(String hn,String id,String ha,String inb,
			String t,String i,String s,ArrayList<HotelVO> hl,double ps,double po,int r){
		hotelName = hn;
		hotelID = id;
		hotelAddress = ha;
		inBusiness = inb;
		tel = t;
		info = i;
		sort = s;
		hotelList = hl;
		poStrings = ps;
		points = po;
		readyRoom = r;
	}
	//��ʾȫ���Ƶ�
	public ArrayList<HotelVO> showHotelList(){
		return hotelList;
	}
	//��ʾĳ���Ƶ�ľ�����Ϣ�����ͻ���ѯ�ã�
	public ResultMessage showHotelInfo(){
		return ResultMessage.SUCCEED;
	}
	//Ϊ�Ƶ��б���������
	public ArrayList<HotelVO> sortHotel(String sort,ArrayList<HotelVO> hotelList){
		if(sort == this.sort){
			return this.hotelList;
		}else{
			return null;
		}
	}
	//���ҾƵ꣨ģ�����ң�
	public ResultMessage findHotel(String info){
		if(info == this.info){
			return ResultMessage.SUCCEED;
		}else{
			return ResultMessage.FAILED;
		}
	}
	//��ʾ�Ƶ�Ŀ��෿����
	public int getReadyRoom(){
		return readyRoom;
	}
	//��ʾ�Ƶ������
	public double getPoStrings(double poString){
		if(poString == this.poStrings){
			return points;
		}else{
			return 0;
		}
	}
	
	
}
