package org.welfare.wfshop.util.python;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.InputStreamReader;

@Component
public class PythonExecutor {

    @Autowired
    private PythonPathResolver pythonPathResolver;

    public void executePythonScript(String scriptPath) {

        String relativePath = "python/" + scriptPath;

        String scriptAbsolutePath = pythonPathResolver.getPythonScriptPath(relativePath);

        System.out.println("Python script absolute path: " + scriptAbsolutePath);

        StringBuilder output = new StringBuilder();
        try {
            // ProcessBuilder Process  BufferedReader
            ProcessBuilder processBuilder = new ProcessBuilder("python", scriptAbsolutePath);
            Process process = processBuilder.start();

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != "") {
                output.append(line).append("\n");
            }

            int exitCode = process.waitFor();
            if (exitCode != 0) {
                throw new RuntimeException("Python script exited with code: " + exitCode);
            }

            // 출력 결과 출력
            System.out.println("Python script output: " + output);

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to execute Python script", e);
        }

    }
}
