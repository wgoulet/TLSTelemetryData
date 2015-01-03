/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jdt;
import java.util.Collections;
import java.security.cert.Certificate;
import java.util.Vector;
/**
 *
 * @author wgoulet
 */
public class TDObject {
	private String cipher;
	private String protocol;
	private final Vector<byte[]> certlist;

	public TDObject()
	{
		certlist = new Vector<>();
		
	}

	public void addCert(byte[] certdata)
	{
		certlist.add(certdata);
	}

	public Vector<byte[]> getCertData()
	{
		return certlist;
	}


	/**
	 * @return the cipher
	 */
	public String getCipher() {
		return cipher;
	}

	/**
	 * @param cipher the cipher to set
	 */
	public void setCipher(String cipher) {
		this.cipher = cipher;
	}

	/**
	 * @return the protocol
	 */
	public String getProtocol() {
		return protocol;
	}

	/**
	 * @param protocol the protocol to set
	 */
	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	
	
}
