package utils;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {
	static NumberFormat cobalto = new DecimalFormat("R$ #,##0.00");
	static SimpleDateFormat vtoc = new SimpleDateFormat("dd/MM/yyyy");
	
	public static String dateToString(Date data) {
		return Utils.vtoc.format(data);
	}
	
	public static String doubleToString(Double valor) {
		return Utils.cobalto.format(valor);
	}
}
