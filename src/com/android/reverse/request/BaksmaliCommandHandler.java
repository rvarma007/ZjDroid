package com.android.reverse.request;

import com.android.reverse.collecter.DexFileInfoCollecter;
import com.android.reverse.collecter.ModuleContext;
import com.android.reverse.util.Logger;

public class BaksmaliCommandHandler implements CommandHandler {

	private String dexpath;

	public BaksmaliCommandHandler(String dexpath) {
		this.dexpath = dexpath;
	}

	@Override
	public void doAction() {
		// TODO Auto-generated method stub
		String filename = ModuleContext.getInstance().getAppContext().getFilesDir()+"/dexfile.dex";
		DexFileInfoCollecter.getInstance().baksmaliDexFile(filename, dexpath);
		Logger.log("the dexfile data save to ="+filename);
	}

}
