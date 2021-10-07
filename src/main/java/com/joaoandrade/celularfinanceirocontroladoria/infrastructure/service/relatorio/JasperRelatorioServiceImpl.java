package com.joaoandrade.celularfinanceirocontroladoria.infrastructure.service.relatorio;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.joaoandrade.celularfinanceirocontroladoria.domain.service.relatorio.RelatorioService;

import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@Primary
@Component
public class JasperRelatorioServiceImpl implements RelatorioService {

	@Override
	public String gerarRelatorio(String nomeRelatorio, Map<String, Object> parametros, List<?> colecao)
			throws Exception {
		String caminho = "src" + File.separator + "main" + File.separator + "resources" + File.separator + "relatorios"
				+ File.separator + nomeRelatorio + ".jasper";

		JRBeanCollectionDataSource jrBeanCollectionDataSource = new JRBeanCollectionDataSource(colecao);
		JasperPrint jasperPrint = JasperFillManager.fillReport(caminho, parametros, jrBeanCollectionDataSource);

		return "data:application/pdf;base64,"
				+ Base64.encodeBase64String(JasperExportManager.exportReportToPdf(jasperPrint));
	}

}
