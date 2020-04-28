package com.example.test3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class PrivacyPolicy extends AppCompatActivity {

    TextView contentView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy_policy);
        contentView=(TextView)findViewById(R.id.content);
        String para="Forteway OPC Pvt. Ltd. is an organization engaged in the processing of panel research data that it hires and retains in different countries around the world. Forteway OPC Pvt. Ltd. has developed this Privacy Statement to demonstrate our firm commitment to privacy and data protection regulations.\n" +
                "\n" +
                "Bheemcash is Foretway's proprietary platform through which it conducts all its surveys and rewards it's panellists in the form of e-vouchers and points.\n" +
                "\n" +
                "There may be other elements of this policy that may only apply to you if you are a resident of the European Union or a citizen of the European Union and, therefore, if you are a person intending to participate in our European Union surveys, you are required to keep us aware of the same, as you would be subject to additional data protection rights if you were operating from the European Union You can write to us, by contacting us at dataprotectionofficer@fortewaygroup.com , to inform the details of your affiliation with the EU.\n" +
                "\n" +
                "Information we collect through Bheemcash website and features:\n" +
                "Information (such as your name, email address, postal address and telephone number) that you provide by registering as a member or completing a user profile or other forms via the Bheemcash Site and Features.\n" +
                "Information you upload or submit in relation to any sweepstakes, contests or promotions that may be offered.\n" +
                "Information you upload or submit in relation to any rewards programs that we offer in connection with an account sign-in facility, your log-in and password details.\n" +
                "Communications you send to us, for example to report a problem or to submit queries, concerns or comments.\n" +
                "Information from surveys that we may, from time to time, present on the Bheemcash Site and Features for research purposes, whether for ourselves or for third-party research companies, if you choose to respond to or participate in them.\n" +
                "Cookies:\n" +
                "Some of the cookies we use on our or on the website of our partners are required to identify and verify a user, protecting access to the profile and account information of a user. The privacy settings of a user's browser must be configured to allow Bheemcash cookies, or a user can not register / send information or access the Bheemcash Portal. Users can change the privacy settings of their browser to delete cookies when they exit websites or when they close their browser. Bheemcash documents the web pages with details of the user accesses. Such information may include descriptions of IP addresses and browser forms in the Internet.\n" +
                "\n" +
                "Data Encryption:\n" +
                "All the user information is encrypted and no data are exchanged with a third party. Therefore, the data is under the strict supervision of our Data Protection Officer and their access is limited to just a few of this organization's employees. You can write to us, by contacting us at dataprotectionofficer@fortewaygroup.com\n" +
                "\n" +
                "We also use the contact information given in the registration form to give you information on our business and its services. Through selecting the unsubscribe option in the mail, users can opt-out from receiving future mailings.\n" +
                "\n" +
                "External links:\n" +
                "From time to time the Bheemcash page can contain links to market research firms, or other external sites. We are not responsible for the privacy policies or content of these pages.\n" +
                "\n" +
                "Children's privacy:\n" +
                "Bheemcash gathers no details from any child without his / her parents or legal guardian's permission. When Bheemcash finds that a child under the age of 16 has submitted personally identifiable information online, Bheemcash shall take all appropriate steps to remove such information from its databases and not use such information for any purpose, in contravention of these measures.\n" +
                "\n" +
                "Your rights:\n" +
                "You have a privilege under the United Kingdom Data Protection Act 1998 and/or the General Data Privacy Regulation (GDPR) of the EU for a list of all personal data kept by us about you. You can download all the data we have about you from your “Profile” page upon login to Bheemcash site. You also have the right in that knowledge to correct any errors. You also have the right to delete this information, but in that case, we may obviously have to close your account and your involvement in any of our Rewards Programs as we would not be able to continue to give you our Services. Feel free to write to pii@bheemcash.com for any questions on your data we have collected.\n" +
                "\n" +
                "Contact us:\n" +
                "If you have any questions about this privacy statement, the practices of this site, or your dealings with this Website, you can contact Bheemcash or write to info@bheemcash.com";
        contentView.setText(para);
        contentView.setMovementMethod(new ScrollingMovementMethod());
    }
}
