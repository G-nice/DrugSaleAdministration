package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class MyWindow extends JFrame implements ActionListener {
	private static final long serialVersionUID = 2196540117576619670L;
	private JTabbedPane tabPane;

	MyWindow() {
		super("ҩƷ���۹���");
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		setBounds(100, 100, 1000, 500);

		this.tabPane = new JTabbedPane();
		this.tabPane.setTabPlacement(1);
		add(this.tabPane);

		DrugPanel drugPanel = new DrugPanel(this);
		this.tabPane.addTab("ҩƷҳ��", createImageIcon("drug"), drugPanel);
		HospitalPanel hospitalPanel = new HospitalPanel(this);
		this.tabPane.addTab("ҽԺҳ��", createImageIcon("hospital"), hospitalPanel);
		SupplerPanel supplerPanel = new SupplerPanel(this);
		this.tabPane.addTab("��Ӧ��ҳ��", createImageIcon("factory"), supplerPanel);
		PurchasePanel purchasePanel = new PurchasePanel(this);
		this.tabPane.addTab("����ҳ��", createImageIcon("in"), purchasePanel);
		SalePanel salePanel = new SalePanel(this);
		this.tabPane.addTab("����ҳ��", createImageIcon("out"), salePanel);
		BalancePanel balancePanel = new BalancePanel();
		this.tabPane.addTab("ͳ��ҳ��", createImageIcon("statistic"), balancePanel);
		HelpPanel helpPanel = new HelpPanel(this);
		this.tabPane.addTab("����ҳ��", createImageIcon("welcome"), helpPanel);

		setVisible(true);
		validate();
	}

	protected static ImageIcon createImageIcon(String name) {
		String path = "./pic/" + name + ".png";
		return new ImageIcon(path);
	}

	public void actionPerformed(ActionEvent arg0) {
	}
}
