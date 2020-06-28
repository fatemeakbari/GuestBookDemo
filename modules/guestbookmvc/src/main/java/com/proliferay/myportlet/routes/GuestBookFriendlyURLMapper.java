package com.proliferay.myportlet.routes;

import com.liferay.portal.kernel.portlet.DefaultFriendlyURLMapper;
import com.liferay.portal.kernel.portlet.FriendlyURLMapper;
import com.proliferay.myportlet.constants.GuestBookMVCPortletKeys;
import org.osgi.service.component.annotations.Component;


@Component(
        property = {
                "com.liferay.portlet.friendly-url-routes=META-INF/friendly-url-routes/routes.xml",
                "javax.portlet.name=" + GuestBookMVCPortletKeys.GUESTBOOK
        },
        service = FriendlyURLMapper.class
)
public class GuestBookFriendlyURLMapper extends DefaultFriendlyURLMapper {

        @Override
        public String getMapping() {
            return _MAPPING;
        }

        private static final String _MAPPING = "entry";

    }

