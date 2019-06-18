package edu.handong.csee;

 
public class Data<E> {
	private Object element[];
	private int index;
	
	public Data() {
		element = new Object[10000];
	}
	public void add(E e) {
		this.element[index++] = e;
	}
}

/*public ArrayList<Data> ExcelWriter() {
//	public void write(String path) { //./thear.xls  path = 읽을 파일 경로
		try(OutputStream oup = new FileOutputStream(path)) {
			
			Workbook wb = WorkbookFactory.create(oup);
			Sheet sheet = wb.getSheetAt(0);
			Data.getValue();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
}*/