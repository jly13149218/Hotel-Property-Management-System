/**
 * @version 2016-10-15
 * @author ������
 * @description ����Ƶ�����������Ҫ�ķ���
 */

/**
 * �Ƶ�������У�
 * ��ţ����ƣ�������Ȧ����飬��ַ����ϵ��ʽ
 * �ܷ����������֣����෿����
 * �Ƶ�Ĳ�ѯ����ͨ��ѡ��Ƶ���ࡢ����ؼ��ֽ���ģ������
 * @author ������
 * @version 2016-10-15
 *
 */
public interface HotelBLservice {
	
	/**
	 * ��ʾȫ���Ƶ�
	 * @return ȫ���Ƶ��ArrayList
	 * @author ������
     * @version 2016-10-15
	 */
	public ArrayList<HotelVO> showHotelList();
	
	/**
	 * ��ʾĳ���Ƶ�ľ�����Ϣ�����ͻ���ѯ�ã�
	 * @return
	 * @author ������
     * @version 2016-10-15
	 */
	public ResultMessage showHotelInfo();
	
	/**
	 * Ϊ�Ƶ��б���������
	 * @param sort �Ƶ����
	 * @param hotelList �Ƶ��б�
	 * @return �����ľƵ��б�
	 * @author ������
     * @version 2016-10-15 
	 */
	public ArrayList<HotelVO> sortHotel(String sort,ArrayList<HotelVO> hotelList);
	
	/**
	 * ���ҾƵ꣨ģ�����ң�
	 * @param info �ؼ���
	 * @return ����������ȫ���Ƶ�
	 * @author ������
     * @version 2016-10-15
	 */
	public ResultMessage findHotel(String info);
	
	/**
	 * ��ʾ�Ƶ�Ŀ��෿����
	 * @return ���෿����
	 * @author ������
     * @version 2016-10-15
	 */
	public int getReadyRoom();
	
	/**
	 * ��ʾ�Ƶ������
	 * @param poString �ͻ�����
	 * @return �Ƶ�����
	 * @author ������
     * @version 2016-10-15
	 */
	public double getPoStrings(double poString);
	
}
