package com.tao.taoaiagent.tools;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class FileOperationToolTest {

    @Test
    public void testReadFile() {
        FileOperationTool tool = new FileOperationTool();
        String fileName = "贪心宝典.txt";
        String result = tool.readFile(fileName);
        assertNotNull(result);
    }

    @Test
    public void testWriteFile() {
        FileOperationTool tool = new FileOperationTool();
        String fileName = "贪心宝典.txt";
        String content = "啊啊啊啊宝宝你是一个香香软软甜甜糯糯蜂蜜奶油甜甜腻腻酥酥脆脆滑滑嫩嫩番茄炒可乐番茄炒科比草莓蓝莓苹果香蕉葡萄香香甜甜酸酸甜甜辣辣爽爽咸咸鲜鲜苦苦甘甘滑滑嫩嫩酥酥脆脆软软绵绵弹弹润润油油腻腻清清爽爽浓浓醇醇淡淡幽幽热热乎乎冰冰凉凉黏黏糊糊爽爽脆脆鲜鲜嫩嫩辣辣麻苦苦辣辣苹果香蕉橙子草莓葡萄西瓜樱桃菠萝猕猴桃蓝莓桃子梨杏李子西红柿黄瓜胡萝卜生菜菠菜花椰菜卷心菜洋葱大蒜土豆红薯南瓜玉米豌豆扁豆红豆绿豆黄豆黑豆鸡蛋牛奶奶酪酸奶黄油面包面条米饭燕麦玉米片饼干蛋糕油鱼虾蟹龙虾贝类牛肉羊肉猪肉鸡肉鸭肉鹅肉火鸡肉香肠火腿培根肉丸汉堡热狗披萨寿司拉面咖喱炖肉烤肉烤鱼烤鸡沙拉汤粥蒸蛋豆腐豆浆豆奶豆腥草豆皮豆干芒果柠檬柚子金桔百香果火龙果牛油果无花果荔枝龙眼枇杷山楂桑葚甜瓜哈密瓜甜菜根莴苣茼蒿芥蓝芹菜荠菜苋菜意式烤蔬菜配香草酱和橄榄油鲜美多汁香脆可口滑嫩浓郁醇厚甘甜爽口香辣酸甜苦辣咸香酥软糯滑爽劲道鲜美清香扑鼻诱人色泽鲜艳香气扑鼻口感丰富层次分明风味独特香气四溢回味无穷色香味俱佳口感细腻肉质鲜嫩色泽金黄外酥里嫩香气浓郁味道鲜美口感滑嫩味道醇厚味道独特味道浓郁口感丰富味道鲜美味道醇厚味道独特香气扑鼻的小蛋糕";
        String result = tool.writeFile(fileName, content);
        assertNotNull(result);
    }
}
