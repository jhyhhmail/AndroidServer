package com.jhy.server.utils;

import java.util.Iterator;
import java.util.List;

public class MainHelper {

	public static String listtoString(List<String> list){
		return listtoString(list, ",","'");
	}
	public static String listtoString(List<String> list,String split,String yh) {
		StringBuffer buf = new StringBuffer();
		Iterator<String> iter = list.iterator();
		boolean hasNext = iter.hasNext();
		while (hasNext) {
			String o = iter.next(); 
			buf.append( yh+ String.valueOf(o)+yh);
			hasNext = iter.hasNext();
			if (hasNext)
				buf.append(split);
		}

		return buf.toString();
	}
}
