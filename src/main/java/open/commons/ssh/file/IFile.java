/*
 *
 * This file is generated under this project, "open-commons-ssh".
 *
 * Date  : 2020. 10. 23. 오후 4:53:35
 *
 * Author: Park_Jun_Hong_(fafanmama_at_naver_com)
 * 
 */

package open.commons.ssh.file;

import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import open.commons.Result;

import com.jcraft.jsch.ChannelSftp.LsEntry;

/**
 * 파일이나 디렉토리 관련 기능을 제공한다.
 * 
 * @since 2020. 10. 23.
 * @version
 * @author Park_Jun_Hong_(fafanmama_at_naver_com)
 */
public interface IFile {

    /**
     * 파일 권한을 변경한다.<br>
     * 
     * <pre>
     * [개정이력]
     *      날짜    	| 작성자	|	내용
     * ------------------------------------------
     * 2020. 10. 26.		박준홍			최초 작성
     * </pre>
     *
     * @param filepath
     *            파일 또는 디렉토리 경로
     * @param permission
     *            8진법 표기 파일 권한
     * @return
     *
     * @since 2020. 10. 26.
     * @author Park_Jun_Hong_(fafanmama_at_naver_com)
     */
    public Result<LsEntry> chmodOtcalMode(@NotNull @NotEmpty String filepath, int permission);

    /**
     * 파일 권한을 변경한다.<br>
     * 
     * <pre>
     * [개정이력]
     *      날짜    	| 작성자	|	내용
     * ------------------------------------------
     * 2020. 10. 26.		박준홍			최초 작성
     * </pre>
     *
     * @param filepath
     *            파일 또는 디렉토리 경로
     * @param permission
     *            8진법 표기 파일 권한
     * @param connectTimeout
     *            접속대기 제한시간. (단위: ms)
     * @return
     *
     * @since 2020. 10. 26.
     * @author Park_Jun_Hong_(fafanmama_at_naver_com)
     */
    public Result<LsEntry> chmodOtcalMode(@NotNull @NotEmpty String filepath, int permission, @Min(1) int connectTimeout);

    /**
     * 파일을 삭제한다. <br>
     * 
     * <pre>
     * [개정이력]
     *      날짜      | 작성자   |   내용
     * ------------------------------------------
     * 2020. 10. 27.        박준홍         최초 작성
     * </pre>
     *
     * @param filepath
     *            파일 경로
     * @return
     *
     * @since 2020. 10. 27.
     * @author Park_Jun_Hong_(fafanmama_at_naver_com)
     */
    public Result<Boolean> delete(@NotNull @NotEmpty String filepath);

    /**
     * 파일을 삭제한다. <br>
     * 
     * <pre>
     * [개정이력]
     *      날짜      | 작성자   |   내용
     * ------------------------------------------
     * 2020. 10. 27.        박준홍         최초 작성
     * </pre>
     *
     * @param filepath
     *            파일 경로
     * @param connectTimeout
     *            접속대기 제한 시간. (단위: ms)
     * @return
     *
     * @since 2020. 10. 27.
     * @author Park_Jun_Hong_(fafanmama_at_naver_com)
     */
    public Result<Boolean> delete(@NotNull @NotEmpty String filepath, @Min(1) int connectTimeout);

    /**
     * 디렉토리를 삭제한다. <br>
     * 
     * <pre>
     * [개정이력]
     *      날짜      | 작성자   |   내용
     * ------------------------------------------
     * 2020. 10. 27.        박준홍         최초 작성
     * </pre>
     *
     * @param filepath
     *            디렉토리 경로
     * @return
     *
     * @since 2020. 10. 27.
     * @author Park_Jun_Hong_(fafanmama_at_naver_com)
     */
    public Result<Boolean> deleteDir(@NotNull @NotEmpty String filepath);

    /**
     * 디렉토리를 삭제한다. <br>
     * 
     * <pre>
     * [개정이력]
     *      날짜      | 작성자   |   내용
     * ------------------------------------------
     * 2020. 10. 27.        박준홍         최초 작성
     * </pre>
     *
     * @param filepath
     *            디렉토리 경로
     * @param connectTimeout
     *            접속대기 제한 시간. (단위: ms)
     * @return
     *
     * @since 2020. 10. 27.
     * @author Park_Jun_Hong_(fafanmama_at_naver_com)
     */
    public Result<Boolean> deleteDir(@NotNull @NotEmpty String filepath, @Min(1) int connectTimeout);

    /**
     * 파일 또는 디렉토리 조회 결과를 제공한다. <br>
     * 
     * <pre>
     * [개정이력]
     *      날짜    	| 작성자	|	내용
     * ------------------------------------------
     * 2020. 10. 23.		박준홍			최초 작성
     * </pre>
     *
     * @param filepath
     *            파일 또는 디렉토리 경로
     * @return
     *
     * @since 2020. 10. 23.
     * @author Park_Jun_Hong_(fafanmama_at_naver_com)
     */
    public Result<List<LsEntry>> list(@NotNull @NotEmpty String filepath);

    /**
     * 파일 또는 디렉토리 조회 결과를 제공한다. <br>
     * 
     * <pre>
     * [개정이력]
     *      날짜    	| 작성자	|	내용
     * ------------------------------------------
     * 2020. 10. 23.		박준홍			최초 작성
     * </pre>
     *
     * @param filepath
     *            파일 또는 디렉토리 경로
     * @param connectTimeout
     *            접속대기 제한시간. (단위: ms)
     * @return
     *
     * @since 2020. 10. 23.
     * @author Park_Jun_Hong_(fafanmama_at_naver_com)
     */
    public Result<List<LsEntry>> list(@NotNull @NotEmpty String filepath, @Min(1) int connectTimeout);

    /**
     * 디렉토리를 생성한다. (부모 디렉토리까지 자동으로 생성한다.) <br>
     * 
     * <pre>
     * [개정이력]
     *      날짜    	| 작성자	|	내용
     * ------------------------------------------
     * 2020. 10. 26.		박준홍			최초 작성
     * </pre>
     *
     * @param directory
     * @return
     *
     * @since 2020. 10. 26.
     * @author Park_Jun_Hong_(fafanmama_at_naver_com)
     */
    public Result<Boolean> mkdirs(@NotNull @NotEmpty String directory);

    /**
     * 디렉토리를 생성한다. (부모 디렉토리까지 자동으로 생성한다.) <br>
     * 
     * <pre>
     * [개정이력]
     *      날짜    	| 작성자	|	내용
     * ------------------------------------------
     * 2020. 10. 26.		박준홍			최초 작성
     * </pre>
     *
     * @param directory
     * @param connectTimeout
     * @return
     *
     * @since 2020. 10. 26.
     * @author Park_Jun_Hong_(fafanmama_at_naver_com)
     */
    public Result<Boolean> mkdirs(@NotNull @NotEmpty String directory, @Min(1) int connectTimeout);

}
