var mp = mp || {};

/**
 * 将form表单数据构建成一个对象。form:表单，用于提取参数，组装json对象
 */
mp.buildForm = function(form) {
	// 提取form中的element
	var formData = ControlUtils.getNamedComp(form);
	var _params = {};
	var _radiocheckbox = /^(?:checkbox|radio)$/i;
	jQuery.each(formData, function(i, field) {
		if (field.name != null && field.name.length > 0
				&& field.value != undefined && field.value.length > 0) {
			// 判断如果是check就取chceked的状态
			if (_radiocheckbox.test(field.type)) {
				_params[field.name] = field.checked;
			} else {
				_params[field.name] = field.value;
			}
		}
	});

	return _params;
};


/**
 * 发送一个同步请求到{_url},参数是{_data}。ruturn 响应结果。
 */
mp.syncRequest = function(_url, _data,_type) {
	var result = '';
	(_type=='' || _type==undefined)?_type = 'json':_type;
	var _contentType =  "application/"+_type+";charset=UTF-8;"; 
	var params = {
			url : _url,
			data : _data,
			cache : false,
			async : false,
			type : 'POST',
			dataType : 'json', 
			contentType:_contentType,
			success : function(data) {
				result = data;
				if(data.htmlValue!=null){
					result = data.htmlValue;
				}
			},
			 error: function(request ){ 
//				 mp.createDialog(request.responseText).dialog('open');
	         } 
		}
	if(_data =='' || _data==null){
		delete params['data'];
	}
	if(_type =='default'){
		delete params['dataType'];
		delete params['contentType'];
	}
	
	$.ajax(params);
	return result;
}

/**
 * 发送一个异步请求到{_url},参数是{_data}。执行完成调用callback
 */
mp.asyncRequest = function(_url, _data,_type,callback) {
	var result = '';
	(_type=='' || _type==undefined)?_type = 'json':_type;
	var _contentType =  "application/"+_type+";charset=UTF-8;"; 
	var params = {
			url : _url,
			data : _data,
			cache : false,
			async : true,
			type : 'POST',
			dataType : 'json', 
			contentType:_contentType,
			success : callback,
			 error: function(request ){ 
//				 mp.createDialog(request.responseText).dialog('open');
	         } 
		}
	if(_data =='' || _data==null){
		delete params['data'];
	}
	if(_type =='default'){
		delete params['dataType'];
		delete params['contentType'];
	}
	$.ajax(params);
	return result;
}