package com.botlie.employeeAssimilation.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;



@Entity
@Table(name = "client_admin")
public class Admin_client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="clint_id")
	private int clint_id;

	private String company_setup;
	private String company_content;
	private String manage_uset;
	private String upload_candidate;
	private String pre_offer;
	private String offer_letter;
	private String pre_onboarding;
	private String onboarding;
	private String faq;
	private String background_varification;
	private String candidate_archieve;
	private String reach_out_candidate;
	private String analytics_out_candidate;
	private String help_and_support;
	private String predictive_analysis;
	private String plan;
	private String payment;
	private String notification;
	private String asset;
	private String account;
	private boolean status;
	public int getClint_id() {
		return clint_id;
	}
	public void setClint_id(int clint_id) {
		this.clint_id = clint_id;
	}
	public String getCompany_setup() {
		return company_setup;
	}
	public void setCompany_setup(String company_setup) {
		this.company_setup = company_setup;
	}
	public String getCompany_content() {
		return company_content;
	}
	public void setCompany_content(String company_content) {
		this.company_content = company_content;
	}
	public String getManage_uset() {
		return manage_uset;
	}
	public void setManage_uset(String manage_uset) {
		this.manage_uset = manage_uset;
	}
	public String getUpload_candidate() {
		return upload_candidate;
	}
	public void setUpload_candidate(String upload_candidate) {
		this.upload_candidate = upload_candidate;
	}
	public String getPre_offer() {
		return pre_offer;
	}
	public void setPre_offer(String pre_offer) {
		this.pre_offer = pre_offer;
	}
	public String getOffer_letter() {
		return offer_letter;
	}
	public void setOffer_letter(String offer_letter) {
		this.offer_letter = offer_letter;
	}
	public String getPre_onboarding() {
		return pre_onboarding;
	}
	public void setPre_onboarding(String pre_onboarding) {
		this.pre_onboarding = pre_onboarding;
	}
	public String getOnboarding() {
		return onboarding;
	}
	public void setOnboarding(String onboarding) {
		this.onboarding = onboarding;
	}
	public String getFaq() {
		return faq;
	}
	public void setFaq(String faq) {
		this.faq = faq;
	}
	public String getBackground_varification() {
		return background_varification;
	}
	public void setBackground_varification(String background_varification) {
		this.background_varification = background_varification;
	}
	public String getCandidate_archieve() {
		return candidate_archieve;
	}
	public void setCandidate_archieve(String candidate_archieve) {
		this.candidate_archieve = candidate_archieve;
	}
	public String getReach_out_candidate() {
		return reach_out_candidate;
	}
	public void setReach_out_candidate(String reach_out_candidate) {
		this.reach_out_candidate = reach_out_candidate;
	}
	public String getHelp_and_support() {
		return help_and_support;
	}
	public void setHelp_and_support(String help_and_support) {
		this.help_and_support = help_and_support;
	}
	public String getPredictive_analysis() {
		return predictive_analysis;
	}
	public void setPredictive_analysis(String predictive_analysis) {
		this.predictive_analysis = predictive_analysis;
	}
	public String getPlan() {
		return plan;
	}
	public void setPlan(String plan) {
		this.plan = plan;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	public String getNotification() {
		return notification;
	}
	public void setNotification(String notification) {
		this.notification = notification;
	}
	public String getAsset() {
		return asset;
	}
	public void setAsset(String asset) {
		this.asset = asset;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getAnalytics_out_candidate() {
		return analytics_out_candidate;
	}
	public void setAnalytics_out_candidate(String analytics_out_candidate) {
		this.analytics_out_candidate = analytics_out_candidate;
	}
	
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Admin_client(int clint_id, String company_setup, String company_content, String manage_uset,
			String upload_candidate, String pre_offer, String offer_letter, String pre_onboarding, String onboarding,
			String faq, String background_varification, String candidate_archieve, String reach_out_candidate,
			String analytics_out_candidate, String help_and_support, String predictive_analysis, String plan,
			String payment, String notification, String asset, String account, boolean status) {
		super();
		this.clint_id = clint_id;
		this.company_setup = company_setup;
		this.company_content = company_content;
		this.manage_uset = manage_uset;
		this.upload_candidate = upload_candidate;
		this.pre_offer = pre_offer;
		this.offer_letter = offer_letter;
		this.pre_onboarding = pre_onboarding;
		this.onboarding = onboarding;
		this.faq = faq;
		this.background_varification = background_varification;
		this.candidate_archieve = candidate_archieve;
		this.reach_out_candidate = reach_out_candidate;
		this.analytics_out_candidate = analytics_out_candidate;
		this.help_and_support = help_and_support;
		this.predictive_analysis = predictive_analysis;
		this.plan = plan;
		this.payment = payment;
		this.notification = notification;
		this.asset = asset;
		this.account = account;
		this.status = status;
	}
	public Admin_client() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
