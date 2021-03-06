package top.lothar.sdims.dto;

import java.util.List;
import top.lothar.sdims.entity.Repository;
/**
 * 仓库信息，以及分页数据临时存储对象,以及状态信息
 * @author Lothar
 *
 */
public class RepositoryExecution {
	
	private String stateInfo;
	
	private int count;
	
	private List<Repository> repositoryList;
	/**
	 * 无参构造
	 */
	public RepositoryExecution() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * 失败构造器
	 * @param stateInfo
	 */
	public RepositoryExecution(String stateInfo) {
		this.stateInfo = stateInfo;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public List<Repository> getRepositoryList() {
		return repositoryList;
	}
	public void setRepositoryList(List<Repository> repositoryList) {
		this.repositoryList = repositoryList;
	}
	public String getStateInfo() {
		return stateInfo;
	}
	public void setStateInfo(String stateInfo) {
		this.stateInfo = stateInfo;
	}
	
}
