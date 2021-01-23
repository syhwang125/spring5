package javapattern.adapter;

public class AdapterImpl implements Adapter {


	@Override
	public Float twiceOf(Float f) {
		System.out.println("두배 함수 호출 ");
//		return (float) Math.twoTime(f.doubleValue());
		return (float) Math.doubled(f.doubleValue());
	}

	@Override
	public Float halfOf(Float f) {
		System.out.println("절반 함수 호출 ");
		return (float) Math.half(f.doubleValue());
	}

}
