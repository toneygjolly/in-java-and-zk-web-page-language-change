package language;

import java.util.Locale;

import org.zkoss.web.Attributes;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zul.Window;

public class langpart extends SelectorComposer<Window>{
	@Listen("onClick=#locale_de")
	public void setLocalEn() {
		Locale locale = new Locale("de","DE");
		Sessions.getCurrent().setAttribute(Attributes.PREFERRED_LOCALE, locale);
		Executions.sendRedirect("");
	}
	@Listen("onClick=#locale_ml")
	public void setLocalE() {
		Locale locale = new Locale("ml");
		Sessions.getCurrent().setAttribute(Attributes.PREFERRED_LOCALE, locale);
		Executions.sendRedirect("");
	}


}
