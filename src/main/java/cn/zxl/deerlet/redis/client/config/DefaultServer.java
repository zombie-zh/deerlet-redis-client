/**
 * 
 */
package cn.zxl.deerlet.redis.client.config;

/**
 * @author zuoxiaolong
 *
 */
public class DefaultServer implements Server {

	private String host;
	
	private int port;
	
	public DefaultServer() {
		super();
	}

	/**
	 * @param host
	 * @param port
	 */
	public DefaultServer(String host, int port) {
		super();
		this.host = host;
		this.port = port;
	}

	/**
	 * @return the host
	 */
	public String getHost() {
		return host;
	}

	/**
	 * @param host the host to set
	 */
	public void setHost(String host) {
		this.host = host;
	}

	/**
	 * @return the port
	 */
	public int getPort() {
		return port;
	}

	/**
	 * @param port the port to set
	 */
	public void setPort(int port) {
		this.port = port;
	}
	
}
