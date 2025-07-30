package com.tao.taoaiagent.tools;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class PDFGenerationToolTest {

    @Test
    public void testGeneratePDF() {
        PDFGenerationTool tool = new PDFGenerationTool();
        String fileName = "520秘籍.pdf";
        String content = "jfewjkllkasfklndklfaskhl大金额撒林科大双节快乐到期网卡金额火炬大厦库存那是否能马萨";
        String result = tool.generatePDF(fileName, content);
        assertNotNull(result);
    }
}
