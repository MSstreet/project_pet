package com.msproject.pet.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.json.JSONException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import org.json.simple.parser.ParseException;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.*;
import java.nio.file.Paths;


@RequiredArgsConstructor
@Slf4j
@Service
public class PetHospitalService {


//    public void SavePetHospital() throws Exception {
//
//        File stocks = new File(Paths.get("").toAbsolutePath() + "/src/main/java/숙제20211207/Stocks.xml");
//
//        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
//        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
//        Document doc = dBuilder.parse(stocks);
//        doc.getDocumentElement().normalize();
//        System.out.println("파일출력");
//
//        // 읽어들인 파일 불러오기
//        NodeList nodes = doc.getElementsByTagName("stock");
//
//        for (int k = 0; k < nodes.getLength(); k++) {
//            Node node = nodes.item(k);
//
//            if (node.getNodeType() == Node.ELEMENT_NODE) {
//                Element element = (Element) node;
//                System.out.println("Stock Symbol: " + getValue("symbol", element));
//                System.out.println("Stock Price: " + getValue("price", element));
//                System.out.println("Stock Quantity: " + getValue("quantity", element));
//
//            }
//        }
//    }
}
