package entity;
/**
 * 
 * @author Đinh Văn Chiến
 * Đối tượng biến bao gồm valueFirst, valueSecond để cho các class có sử dụng biến float kế thừa
 *
 */
public class Varible {
	private float valueFirst;
	private float valueSecond;

	public float getValueFirst() {
		return valueFirst;
	}
	public void setValueFirst(float valueFirst) {
		this.valueFirst = valueFirst;
	}
	public float getValueSecond() {
		return valueSecond;
	}
	public void setValueSecond(float valueSecond) {
		this.valueSecond = valueSecond;
	}
	
}
