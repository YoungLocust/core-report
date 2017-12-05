package young.locust.core.report.commons.utils.entity;

import java.io.Serializable;

import lombok.Data;

/*
 *  Document    : FileRequestVO
 *  Created on  : 2017年11月14日
 *  Last Update : 2017年11月14日
 *  Author      : chenyb
 */
@Data
public class FileRequestVO implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private String fileName;
	
	private String filePath;
}
