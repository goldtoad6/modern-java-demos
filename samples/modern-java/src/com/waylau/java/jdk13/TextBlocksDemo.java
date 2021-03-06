/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.jdk13;

/**
 * JDK13: Text Blocks (Preview)
 * JEP 355: http://openjdk.java.net/jeps/355
 * 
 * @since 1.0.0 2019年9月19日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
class TextBlocksDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// JDK13之前
		String html = "<html>\n" +
	              "    <body>\n" +
	              "        <p>Hello, world</p>\n" +
	              "    </body>\n" +
	              "</html>\n";

		System.out.println(html);
		
		// JDK13之后
	    @SuppressWarnings("preview")
		String html2 = """
	              <html>
	                  <body>
	                      <p>Hello, world</p>
	                  </body>
	              </html>
	              """;
	    
	    System.out.println(html);
	    System.out.println(html2);
	}

}
