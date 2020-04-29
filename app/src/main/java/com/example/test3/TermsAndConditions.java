package com.example.test3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class TermsAndConditions extends AppCompatActivity {
    TextView contentView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms_and_conditions);
        contentView=(TextView)findViewById(R.id.content);
        String para="Bheemcash is a unit of Forteway OPC Pvt. Ltd., a panel services provider, through the website www.bheemcash.com and/or the app Bheemcash. Our survey scripting services are provided from the proprietary applications through third parties, and those third parties are collectively liable for all liabilities relating to the functionality of the meter listed in these terms and conditions.\n" +
                "\n" +
                "These Terms and Conditions apply to all Bheemcash website and/or app participants.\n" +
                "\n" +
                "Validation:\n" +
                "Survey Speeding: A survey may have an estimated time period in which the survey is to be completed for verification and safety purposes. When you complete the survey within a time frame that does not fall within the estimated time limit, you may be considered not to have completed the survey and therefore may not obtain any opportunities to participate. In addition, you can be terminated from your membership with Bheemcash.\n" +
                "\n" +
                "Red Herring Questions: A survey may include the same or similar questions multiple times, or may allow you to pick a specific answer (so-called Red Herring Questions) to ensure that you are being honest and/or reading all of the survey questions carefully. If your responses to such Red Herring Questions suggest that you are not being honest and/or reading all of the survey questions carefully, you may not qualify for the survey and will therefore obtain no rewards for your participation. Alternatively, we can cancel your membership and delete your account.\n" +
                "\n" +
                "Information (such as your name, email address, postal address and telephone number) that you provide by registering as a member or completing a user profile or other forms via the Bheemcash Site and Features.\n" +
                "Information you upload or submit in relation to any sweepstakes, contests or promotions that may be offered.\n" +
                "Information you upload or submit in relation to any rewards programs that we offer in connection with an account sign-in facility, your log-in and password details.\n" +
                "Communications you send to us, for example to report a problem or to submit queries, concerns or comments.\n" +
                "Information from surveys that we may, from time to time, present on the Bheemcash Site and Features for research purposes, whether for ourselves or for third-party research companies, if you choose to respond to or participate in them.\n" +
                "Rewards:\n" +
                "Bheemcash offers rewards which can be instantly redeemed for the surveys you complete. These redemptions are possible only through the E-vouchers mentioned on our website/ app. We usually share the E-voucher code to you within 3 working days. In case, we don’t have the E-voucher you have redeemed, we will notify you via email. You as a member can either choose another E-voucher for equivalent amount or wait to receive the same E-voucher you have opted for.\n" +
                "\n" +
                "Sweepstakes:\n" +
                "Bheemcash offers points for referrals and survey disqualifications. These points can be redeemed against sweepstakes./p>\n" +
                "\n" +
                "The winners are decided by the Computerized Automated Random Draw System, the winning odds are determined by the number of participants qualified for that particular draw. No transfer of prizes or a cash redemption allowed. Within seven business days of drawing, award winners will be informed via e-mail. To collect their prize, the potential winners must return to Sponsor within fourteen days of being informed, except where prohibited, a copy of the confirmation email received upon entry into the winning Sweepstakes, as well as a recent photograph.\n" +
                "\n" +
                "The winners are decided by the Computerized Automated Random Draw System, the winning odds are determined by the number of participants qualified for that particular draw. No transfer of prizes or a cash redemption allowed. Within seven business days of drawing, award winners will be informed via e-mail. To collect their prize, the potential winners must return to Sponsor within fourteen days of being informed, except where prohibited, a copy of the confirmation email received upon entry into the winning Sweepstakes, as well as a recent photograph.\n" +
                "\n" +
                "Obligations of Member:\n" +
                "Member of Bheemcash warrants:\n" +
                "16 years and older\n" +
                "Not companies or other business entities since they are not eligible to join.\n" +
                "The Panel is formed with legal residents of the State.\n" +
                "Shall not sign more than once with Bheemcash.\n" +
                "Will not try to answer a survey more than once, either by joining a survey using more than one name or more than one email address.\n" +
                "Will be truthful in their approach to the study, such as not providing ambiguous or irrelevant responses, randomly choosing response choices without reading the questions etc.\n" +
                "Bheemcash has no responsibility for any tax due on a member's reward and the member shall be responsible for declaring any income received from Bheemcash under this agreement.";
        contentView.setText(para);
        contentView.setMovementMethod(new ScrollingMovementMethod());
    }
}

