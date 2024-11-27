package org.welfare.wfshop.util.python;

import org.springframework.stereotype.Component;

import java.io.File;
import java.net.URL;

@Component
public class PythonPathResolver {

    public String getPythonScriptPath(String relativePath) {
        // ClassLoader를 사용하여 리소스 파일의 URL 가져오기
        URL resource = getClass().getClassLoader().getResource(relativePath);
        if (  resource == null) {
            throw new IllegalArgumentException("File not found: " + relativePath);
        }

        // URL에서 절대경로 반환
        String absolutePath = new File(resource.getFile()).getAbsolutePath();
        // 절대 경로를 반환합니다.
        return absolutePath;
    }
}

