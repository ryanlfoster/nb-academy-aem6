package uk.co.netbuilder.academy.aem6.core;

import java.util.List;
import java.util.Map;

import uk.co.netbuilder.academy.aem6.core.models.GC;

import com.day.cq.wcm.api.Page;

public interface GCService {
	
	List<GC> listAllGC (Page gcFinderPage);
	
	List<GC> listAllAvailableGC (Page gcFinderPage);
	
	List<GC> listAllGCWithSkill (List<GC> allAvailableGCs, String[] skills);
	
	void createGC (Map<String, String[]> parameters, String fullGCPath);
	
}
