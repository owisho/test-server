package per.owisho.learn.test.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

//@RestController
@SpringBootApplication
@ComponentScan(value = {"per.owisho.learn"})
@EnableAutoConfiguration
@EnableScheduling
public class Example {

//	@RequestMapping("/")
//	String home() {
//		return "Hello World!";
//	}
//	
//	@RequestMapping("/rangerequest")
//	public void rangerequest(HttpServletResponse response,HttpServletRequest request) throws IOException {
//		File file = new File("C:\\\\Users\\\\owisho\\\\Desktop\\\\1.jpg");
//		ArrayList<Range> ranges = parseRange(request, response, file.length());
//		System.out.println(ranges);
//		response.setContentType("multipart/byteranges; boundary=THIS_STRING_SEPARATES");
//		response.setStatus(206);
//		
//		OutputStream oStream = response.getOutputStream();
//		RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
//		if(null!=ranges&&!ranges.isEmpty()) {
//			for(Range range:ranges) {
//				response.setHeader("Content-Range", "bytes "+range.start+"="+range.end+"/"+file.length());
//				response.setHeader("Content-Length", String.valueOf(range.end-range.start+1));
//				randomAccessFile.seek(range.start);
//				for(long i=range.start;i<=range.end;i++) {
//					oStream.write(randomAccessFile.read());
//				}
//				oStream.write("\n\r".getBytes());
//				oStream.flush();
//			}
//		}
//		randomAccessFile.close();
//		oStream.close();
//	}
//	
//	/**
//     * Full range marker.
//     */
//    protected static final ArrayList<Range> FULL = new ArrayList<>();
//	
//	/**
//     * Parse the range header.
//     *
//     * @param request   The servlet request we are processing
//     * @param response  The servlet response we are creating
//     * @param resource  The resource
//     * @return a list of ranges
//     * @throws IOException an IO error occurred
//     */
//    protected ArrayList<Range> parseRange(HttpServletRequest request,
//            HttpServletResponse response,
//            long fileLength) throws IOException {
//
//        if (fileLength == 0)
//            return null;
//
//        // Retrieving the range header (if any is specified
//        String rangeHeader = request.getHeader("Range");
//
//        if (rangeHeader == null)
//            return null;
//        // bytes is the only range unit supported (and I don't see the point
//        // of adding new ones).
//        if (!rangeHeader.startsWith("bytes")) {
//            response.addHeader("Content-Range", "bytes */" + fileLength);
//            response.sendError
//                (HttpServletResponse.SC_REQUESTED_RANGE_NOT_SATISFIABLE);
//            return null;
//        }
//
//        rangeHeader = rangeHeader.substring(6);
//
//        // Vector which will contain all the ranges which are successfully
//        // parsed.
//        ArrayList<Range> result = new ArrayList<>();
//        StringTokenizer commaTokenizer = new StringTokenizer(rangeHeader, ",");
//
//        // Parsing the range list
//        while (commaTokenizer.hasMoreTokens()) {
//            String rangeDefinition = commaTokenizer.nextToken().trim();
//
//            Range currentRange = new Range();
//            currentRange.length = fileLength;
//
//            int dashPos = rangeDefinition.indexOf('-');
//
//            if (dashPos == -1) {
//                response.addHeader("Content-Range", "bytes */" + fileLength);
//                response.sendError
//                    (HttpServletResponse.SC_REQUESTED_RANGE_NOT_SATISFIABLE);
//                return null;
//            }
//
//            if (dashPos == 0) {
//
//                try {
//                    long offset = Long.parseLong(rangeDefinition);
//                    currentRange.start = fileLength + offset;
//                    currentRange.end = fileLength - 1;
//                } catch (NumberFormatException e) {
//                    response.addHeader("Content-Range",
//                                       "bytes */" + fileLength);
//                    response.sendError
//                        (HttpServletResponse
//                         .SC_REQUESTED_RANGE_NOT_SATISFIABLE);
//                    return null;
//                }
//
//            } else {
//
//                try {
//                    currentRange.start = Long.parseLong
//                        (rangeDefinition.substring(0, dashPos));
//                    if (dashPos < rangeDefinition.length() - 1)
//                        currentRange.end = Long.parseLong
//                            (rangeDefinition.substring
//                             (dashPos + 1, rangeDefinition.length()));
//                    else
//                        currentRange.end = fileLength - 1;
//                } catch (NumberFormatException e) {
//                    response.addHeader("Content-Range",
//                                       "bytes */" + fileLength);
//                    response.sendError
//                        (HttpServletResponse
//                         .SC_REQUESTED_RANGE_NOT_SATISFIABLE);
//                    return null;
//                }
//
//            }
//
//            if (!currentRange.validate()) {
//                response.addHeader("Content-Range", "bytes */" + fileLength);
//                response.sendError
//                    (HttpServletResponse.SC_REQUESTED_RANGE_NOT_SATISFIABLE);
//                return null;
//            }
//
//            result.add(currentRange);
//        }
//
//        return result;
//    }
//	
//    protected static class Range {
//
//        public long start;
//        public long end;
//        public long length;
//
//        /**
//         * Validate range.
//         *
//         * @return true if the range is valid, otherwise false
//         */
//        public boolean validate() {
//            if (end >= length)
//                end = length - 1;
//            return (start >= 0) && (end >= 0) && (start <= end) && (length > 0);
//        }
//    }
    
	public static void main(String[] args){
		SpringApplication.run(Example.class, args);
	}
}
